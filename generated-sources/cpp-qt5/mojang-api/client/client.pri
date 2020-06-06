QT += network

HEADERS += \
# Models
    $${PWD}/OAIChangeSkinRequest.h \
    $${PWD}/OAICurrentPlayerIDs.h \
    $${PWD}/OAIError.h \
    $${PWD}/OAINameChange.h \
    $${PWD}/OAIOrderStatistic.h \
    $${PWD}/OAIOrderStatisticsRequest.h \
    $${PWD}/OAIOrderStatisticsResponse.h \
    $${PWD}/OAISecurityAnswer.h \
    $${PWD}/OAISecurityAnswerId.h \
    $${PWD}/OAISecurityChallenge.h \
    $${PWD}/OAISecurityQuestion.h \
    $${PWD}/OAISkinModel.h \
    $${PWD}/OAIUploadSkinRequest.h \
# APIs
    $${PWD}/OAIMiscellaneousApi.h \
    $${PWD}/OAINameHistoryApi.h \
    $${PWD}/OAISecurityQuestionAnswerApi.h \
    $${PWD}/OAISkinOperationsApi.h \
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIModelFactory.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIQObjectWrapper.h

SOURCES += \
# Models
    $${PWD}/OAIChangeSkinRequest.cpp \
    $${PWD}/OAICurrentPlayerIDs.cpp \
    $${PWD}/OAIError.cpp \
    $${PWD}/OAINameChange.cpp \
    $${PWD}/OAIOrderStatistic.cpp \
    $${PWD}/OAIOrderStatisticsRequest.cpp \
    $${PWD}/OAIOrderStatisticsResponse.cpp \
    $${PWD}/OAISecurityAnswer.cpp \
    $${PWD}/OAISecurityAnswerId.cpp \
    $${PWD}/OAISecurityChallenge.cpp \
    $${PWD}/OAISecurityQuestion.cpp \
    $${PWD}/OAISkinModel.cpp \
    $${PWD}/OAIUploadSkinRequest.cpp \
# APIs
    $${PWD}/OAIMiscellaneousApi.cpp \
    $${PWD}/OAINameHistoryApi.cpp \
    $${PWD}/OAISecurityQuestionAnswerApi.cpp \
    $${PWD}/OAISkinOperationsApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp

