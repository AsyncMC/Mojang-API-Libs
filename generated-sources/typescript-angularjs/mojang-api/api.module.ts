import * as api from './api/api';
import * as angular from 'angular';

const apiModule = angular.module('api', [])
.service('MiscellaneousApi', api.MiscellaneousApi)
.service('NameHistoryApi', api.NameHistoryApi)
.service('SecurityQuestionAnswerApi', api.SecurityQuestionAnswerApi)
.service('SkinOperationsApi', api.SkinOperationsApi)

export default apiModule;
