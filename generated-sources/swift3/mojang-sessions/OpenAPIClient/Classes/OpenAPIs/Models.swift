// Models.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

protocol JSONEncodable {
    func encodeToJSON() -> Any
}

public enum ErrorResponse : Error {
    case HttpError(statusCode: Int, data: Data?, error: Error)
    case DecodeError(response: Data?, decodeError: DecodeError)
}

open class Response<T> {
    open let statusCode: Int
    open let header: [String: String]
    open let body: T?

    public init(statusCode: Int, header: [String: String], body: T?) {
        self.statusCode = statusCode
        self.header = header
        self.body = body
    }

    public convenience init(response: HTTPURLResponse, body: T?) {
        let rawHeader = response.allHeaderFields
        var header = [String:String]()
        for case let (key, value) as (String, String) in rawHeader {
            header[key] = value
        }
        self.init(statusCode: response.statusCode, header: header, body: body)
    }
}

public enum Decoded<ValueType> {
    case success(ValueType)
    case failure(DecodeError)
}

public extension Decoded {
    var value: ValueType? {
        switch self {
        case let .success(value):
            return value
        case .failure:
            return nil
        }
    }
}

public enum DecodeError {
    case typeMismatch(expected: String, actual: String)
    case missingKey(key: String)
    case parseError(message: String)
}

private var once = Int()
class Decoders {
    static fileprivate var decoders = Dictionary<String, ((AnyObject, AnyObject?) -> AnyObject)>()

    static func addDecoder<T>(clazz: T.Type, decoder: @escaping ((AnyObject, AnyObject?) -> Decoded<T>)) {
        let key = "\(T.self)"
        decoders[key] = { decoder($0, $1) as AnyObject }
    }

    static func decode<T>(clazz: T.Type, discriminator: String, source: AnyObject) -> Decoded<T> {
        let key = discriminator
        if let decoder = decoders[key], let value = decoder(source, nil) as? Decoded<T> {
            return value
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    static func decode<T>(clazz: [T].Type, source: AnyObject) -> Decoded<[T]> {
        if let sourceArray = source as? [AnyObject] {
            var values = [T]()
            for sourceValue in sourceArray {
                switch Decoders.decode(clazz: T.self, source: sourceValue, instance: nil) {
                case let .success(value):
                    values.append(value)
                case let .failure(error):
                    return .failure(error)
                }
            }
            return .success(values)
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    static func decode<T>(clazz: T.Type, source: AnyObject) -> Decoded<T> {
        switch Decoders.decode(clazz: T.self, source: source, instance: nil) {
    	    case let .success(value):
                return .success(value)
            case let .failure(error):
                return .failure(error)
        }
    }

    static open func decode<T: RawRepresentable>(clazz: T.Type, source: AnyObject) -> Decoded<T> {
        if let value = source as? T.RawValue {
            if let enumValue = T.init(rawValue: value) {
                return .success(enumValue)
            } else {
                return .failure(.typeMismatch(expected: "A value from the enumeration \(T.self)", actual: "\(value)"))
            }
        } else {
            return .failure(.typeMismatch(expected: "\(T.RawValue.self) matching a case from the enumeration \(T.self)", actual: String(describing: type(of: source))))
        }
    }

    static func decode<T, Key: Hashable>(clazz: [Key:T].Type, source: AnyObject) -> Decoded<[Key:T]> {
        if let sourceDictionary = source as? [Key: AnyObject] {
            var dictionary = [Key:T]()
            for (key, value) in sourceDictionary {
                switch Decoders.decode(clazz: T.self, source: value, instance: nil) {
                case let .success(value):
                    dictionary[key] = value
                case let .failure(error):
                    return .failure(error)
                }
            }
            return .success(dictionary)
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    static func decodeOptional<T: RawRepresentable>(clazz: T.Type, source: AnyObject?) -> Decoded<T?> {
        guard !(source is NSNull), source != nil else { return .success(nil) }
        if let value = source as? T.RawValue {
            if let enumValue = T.init(rawValue: value) {
                return .success(enumValue)
            } else {
                return .failure(.typeMismatch(expected: "A value from the enumeration \(T.self)", actual: "\(value)"))
            }
        } else {
            return .failure(.typeMismatch(expected: "\(T.RawValue.self) matching a case from the enumeration \(T.self)", actual: String(describing: type(of: source))))
        }
    }

    static func decode<T>(clazz: T.Type, source: AnyObject, instance: AnyObject?) -> Decoded<T> {
        initialize()
        if let sourceNumber = source as? NSNumber, let value = sourceNumber.int32Value as? T, T.self is Int32.Type {
            return .success(value)
        }
        if let sourceNumber = source as? NSNumber, let value = sourceNumber.int32Value as? T, T.self is Int64.Type {
     	    return .success(value)
        }
        if let intermediate = source as? String, let value = UUID(uuidString: intermediate) as? T, source is String, T.self is UUID.Type {
            return .success(value)
        }
        if let value = source as? T {
            return .success(value)
        }
        if let intermediate = source as? String, let value = Data(base64Encoded: intermediate) as? T {
            return .success(value)
        }

        let key = "\(T.self)"
        if let decoder = decoders[key], let value = decoder(source, instance) as? Decoded<T> {
           return value
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    //Convert a Decoded so that its value is optional. DO WE STILL NEED THIS?
    static func toOptional<T>(decoded: Decoded<T>) -> Decoded<T?> {
        return .success(decoded.value)
    }

    static func decodeOptional<T>(clazz: T.Type, source: AnyObject?) -> Decoded<T?> {
        if let source = source, !(source is NSNull) {
            switch Decoders.decode(clazz: clazz, source: source, instance: nil) {
            case let .success(value): return .success(value)
            case let .failure(error): return .failure(error)
            }
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T>(clazz: [T].Type, source: AnyObject?) -> Decoded<[T]?> where T: RawRepresentable {
        if let source = source as? [AnyObject] {
            var values = [T]()
            for sourceValue in source {
                switch Decoders.decodeOptional(clazz: T.self, source: sourceValue) {
                case let .success(value): if let value = value { values.append(value) }
                case let .failure(error): return .failure(error)
                }
            }
            return .success(values)
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T>(clazz: [T].Type, source: AnyObject?) -> Decoded<[T]?> {
        if let source = source as? [AnyObject] {
            var values = [T]()
            for sourceValue in source {
                switch Decoders.decode(clazz: T.self, source: sourceValue, instance: nil) {
                case let .success(value): values.append(value)
                case let .failure(error): return .failure(error)
                }
            }
            return .success(values)
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T, Key: Hashable>(clazz: [Key:T].Type, source: AnyObject?) -> Decoded<[Key:T]?> {
        if let sourceDictionary = source as? [Key: AnyObject] {
            var dictionary = [Key:T]()
            for (key, value) in sourceDictionary {
                switch Decoders.decode(clazz: T.self, source: value, instance: nil) {
                case let .success(value): dictionary[key] = value
                case let .failure(error): return .failure(error)
                }
            }
            return .success(dictionary)
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T: RawRepresentable, U: AnyObject>(clazz: T, source: AnyObject) -> Decoded<T?> where T.RawValue == U {
        if let value = source as? U {
            if let enumValue = T.init(rawValue: value) {
                return .success(enumValue)
            } else {
                return .failure(.typeMismatch(expected: "A value from the enumeration \(T.self)", actual: "\(value)"))
            }
        } else {
            return .failure(.typeMismatch(expected: "String", actual: String(describing: type(of: source))))
        }
    }


    private static var __once: () = {
        let formatters = [
            "yyyy-MM-dd",
            "yyyy-MM-dd'T'HH:mm:ssZZZZZ",
            "yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ",
            "yyyy-MM-dd'T'HH:mm:ss'Z'",
            "yyyy-MM-dd'T'HH:mm:ss.SSS",
            "yyyy-MM-dd HH:mm:ss"
        ].map { (format: String) -> DateFormatter in
            let formatter = DateFormatter()
            formatter.locale = Locale(identifier: "en_US_POSIX")
            formatter.dateFormat = format
            return formatter
        }
        // Decoder for Date
        Decoders.addDecoder(clazz: Date.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<Date> in
           if let sourceString = source as? String {
                for formatter in formatters {
                    if let date = formatter.date(from: sourceString) {
                        return .success(date)
                    }
                }
            }
            if let sourceInt = source as? Int {
                // treat as a java date
                return .success(Date(timeIntervalSince1970: Double(sourceInt / 1000) ))
            }
            if source is String || source is Int {
                return .failure(.parseError(message: "Could not decode date"))
            } else {
                return .failure(.typeMismatch(expected: "String or Int", actual: "\(source)"))
            }
        }

        // Decoder for ISOFullDate
        Decoders.addDecoder(clazz: ISOFullDate.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<ISOFullDate> in
            if let string = source as? String,
               let isoDate = ISOFullDate.from(string: string) {
                return .success(isoDate)
            } else {
            	return .failure(.typeMismatch(expected: "ISO date", actual: "\(source)"))
            }
        }

        // Decoder for [PlayerProfile]
        Decoders.addDecoder(clazz: [PlayerProfile].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[PlayerProfile]> in
            return Decoders.decode(clazz: [PlayerProfile].self, source: source)
        }

        // Decoder for PlayerProfile
        Decoders.addDecoder(clazz: PlayerProfile.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<PlayerProfile> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? PlayerProfile() : instance as! PlayerProfile
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["id"] as AnyObject?) {
                
                case let .success(value): _result.id = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["name"] as AnyObject?) {
                
                case let .success(value): _result.name = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["legacy"] as AnyObject?) {
                
                case let .success(value): _result.legacy = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: [PlayerProfileProperty].self, source: sourceDictionary["properties"] as AnyObject?) {
                
                case let .success(value): _result.properties = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "PlayerProfile", actual: "\(source)"))
            }
        }
        // Decoder for [PlayerProfileProperty]
        Decoders.addDecoder(clazz: [PlayerProfileProperty].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[PlayerProfileProperty]> in
            return Decoders.decode(clazz: [PlayerProfileProperty].self, source: source)
        }

        // Decoder for PlayerProfileProperty
        Decoders.addDecoder(clazz: PlayerProfileProperty.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<PlayerProfileProperty> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? PlayerProfileProperty() : instance as! PlayerProfileProperty
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["name"] as AnyObject?) {
                
                case let .success(value): _result.name = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Data.self, source: sourceDictionary["value"] as AnyObject?) {
                
                case let .success(value): _result.value = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Data.self, source: sourceDictionary["signature"] as AnyObject?) {
                
                case let .success(value): _result.signature = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "PlayerProfileProperty", actual: "\(source)"))
            }
        }
        // Decoder for [PlayerProfileTexturePropertyValue]
        Decoders.addDecoder(clazz: [PlayerProfileTexturePropertyValue].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[PlayerProfileTexturePropertyValue]> in
            return Decoders.decode(clazz: [PlayerProfileTexturePropertyValue].self, source: source)
        }

        // Decoder for PlayerProfileTexturePropertyValue
        Decoders.addDecoder(clazz: PlayerProfileTexturePropertyValue.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<PlayerProfileTexturePropertyValue> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? PlayerProfileTexturePropertyValue() : instance as! PlayerProfileTexturePropertyValue
                switch Decoders.decodeOptional(clazz: Int64.self, source: sourceDictionary["timestamp"] as AnyObject?) {
                
                case let .success(value): _result.timestamp = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["profileId"] as AnyObject?) {
                
                case let .success(value): _result.profileId = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["profileName"] as AnyObject?) {
                
                case let .success(value): _result.profileName = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["signatureRequired"] as AnyObject?) {
                
                case let .success(value): _result.signatureRequired = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: PlayerTexture.self, source: sourceDictionary["textures"] as AnyObject?) {
                
                case let .success(value): _result.textures = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "PlayerProfileTexturePropertyValue", actual: "\(source)"))
            }
        }
        // Decoder for [PlayerSkinMetadata]
        Decoders.addDecoder(clazz: [PlayerSkinMetadata].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[PlayerSkinMetadata]> in
            return Decoders.decode(clazz: [PlayerSkinMetadata].self, source: source)
        }

        // Decoder for PlayerSkinMetadata
        Decoders.addDecoder(clazz: PlayerSkinMetadata.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<PlayerSkinMetadata> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? PlayerSkinMetadata() : instance as! PlayerSkinMetadata
                switch Decoders.decodeOptional(clazz: PlayerSkinMetadata.Model.self, source: sourceDictionary["model"] as AnyObject?) {
                
                case let .success(value): _result.model = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "PlayerSkinMetadata", actual: "\(source)"))
            }
        }
        // Decoder for [PlayerSkinURL]
        Decoders.addDecoder(clazz: [PlayerSkinURL].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[PlayerSkinURL]> in
            return Decoders.decode(clazz: [PlayerSkinURL].self, source: source)
        }

        // Decoder for PlayerSkinURL
        Decoders.addDecoder(clazz: PlayerSkinURL.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<PlayerSkinURL> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? PlayerSkinURL() : instance as! PlayerSkinURL
                if decoders["\(PlayerTextureURL.self)"] != nil {
                  _ = Decoders.decode(clazz: PlayerTextureURL.self, source: source, instance: _result)
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["url"] as AnyObject?) {
                
                case let .success(value): _result.url = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "PlayerSkinURL", actual: "\(source)"))
            }
        }
        // Decoder for [PlayerTexture]
        Decoders.addDecoder(clazz: [PlayerTexture].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[PlayerTexture]> in
            return Decoders.decode(clazz: [PlayerTexture].self, source: source)
        }

        // Decoder for PlayerTexture
        Decoders.addDecoder(clazz: PlayerTexture.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<PlayerTexture> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? PlayerTexture() : instance as! PlayerTexture
                switch Decoders.decodeOptional(clazz: PlayerSkinURL.self, source: sourceDictionary["SKIN"] as AnyObject?) {
                
                case let .success(value): _result.SKIN = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: PlayerTextureURL.self, source: sourceDictionary["CAPE"] as AnyObject?) {
                
                case let .success(value): _result.CAPE = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "PlayerTexture", actual: "\(source)"))
            }
        }
        // Decoder for [PlayerTextureURL]
        Decoders.addDecoder(clazz: [PlayerTextureURL].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[PlayerTextureURL]> in
            return Decoders.decode(clazz: [PlayerTextureURL].self, source: source)
        }

        // Decoder for PlayerTextureURL
        Decoders.addDecoder(clazz: PlayerTextureURL.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<PlayerTextureURL> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? PlayerTextureURL() : instance as! PlayerTextureURL
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["url"] as AnyObject?) {
                
                case let .success(value): _result.url = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "PlayerTextureURL", actual: "\(source)"))
            }
        }
        // Decoder for [SessionApiError]
        Decoders.addDecoder(clazz: [SessionApiError].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[SessionApiError]> in
            return Decoders.decode(clazz: [SessionApiError].self, source: source)
        }

        // Decoder for SessionApiError
        Decoders.addDecoder(clazz: SessionApiError.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<SessionApiError> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? SessionApiError() : instance as! SessionApiError
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["error"] as AnyObject?) {
                
                case let .success(value): _result.error = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["path"] as AnyObject?) {
                
                case let .success(value): _result.path = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "SessionApiError", actual: "\(source)"))
            }
        }
    }()

    static fileprivate func initialize() {
        _ = Decoders.__once
    }
}