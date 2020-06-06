QT += network

HEADERS += \
# Models
    $${PWD}/OAIPlayerProfile.h \
    $${PWD}/OAIPlayerProfileProperty.h \
    $${PWD}/OAIPlayerProfileTexturePropertyValue.h \
    $${PWD}/OAIPlayerSkinMetadata.h \
    $${PWD}/OAIPlayerSkinURL.h \
    $${PWD}/OAIPlayerTexture.h \
    $${PWD}/OAIPlayerTextureURL.h \
    $${PWD}/OAISessionApiError.h \
# APIs
    $${PWD}/OAIBansApi.h \
    $${PWD}/OAILoginApi.h \
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIModelFactory.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIQObjectWrapper.h

SOURCES += \
# Models
    $${PWD}/OAIPlayerProfile.cpp \
    $${PWD}/OAIPlayerProfileProperty.cpp \
    $${PWD}/OAIPlayerProfileTexturePropertyValue.cpp \
    $${PWD}/OAIPlayerSkinMetadata.cpp \
    $${PWD}/OAIPlayerSkinURL.cpp \
    $${PWD}/OAIPlayerTexture.cpp \
    $${PWD}/OAIPlayerTextureURL.cpp \
    $${PWD}/OAISessionApiError.cpp \
# APIs
    $${PWD}/OAIBansApi.cpp \
    $${PWD}/OAILoginApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp

