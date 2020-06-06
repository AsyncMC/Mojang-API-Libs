QT += network

HEADERS += \
# Models
    $${PWD}/OAIAccessKeys.h \
    $${PWD}/OAIAgent.h \
    $${PWD}/OAIAuthentication.h \
    $${PWD}/OAIAuthenticationRequest.h \
    $${PWD}/OAIError.h \
    $${PWD}/OAIGameProfile.h \
    $${PWD}/OAIGameProfileProperty.h \
    $${PWD}/OAIPrivateUserData.h \
    $${PWD}/OAIProfileId.h \
    $${PWD}/OAIReducedUserData.h \
    $${PWD}/OAIRefreshRequest.h \
    $${PWD}/OAIRefreshResponse.h \
    $${PWD}/OAIUsernamePassword.h \
# APIs
    $${PWD}/OAIDefaultApi.h \
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIModelFactory.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIQObjectWrapper.h

SOURCES += \
# Models
    $${PWD}/OAIAccessKeys.cpp \
    $${PWD}/OAIAgent.cpp \
    $${PWD}/OAIAuthentication.cpp \
    $${PWD}/OAIAuthenticationRequest.cpp \
    $${PWD}/OAIError.cpp \
    $${PWD}/OAIGameProfile.cpp \
    $${PWD}/OAIGameProfileProperty.cpp \
    $${PWD}/OAIPrivateUserData.cpp \
    $${PWD}/OAIProfileId.cpp \
    $${PWD}/OAIReducedUserData.cpp \
    $${PWD}/OAIRefreshRequest.cpp \
    $${PWD}/OAIRefreshResponse.cpp \
    $${PWD}/OAIUsernamePassword.cpp \
# APIs
    $${PWD}/OAIDefaultApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp

