import * as api from './api/api';
import * as angular from 'angular';

const apiModule = angular.module('api', [])
.service('BansApi', api.BansApi)
.service('LoginApi', api.LoginApi)

export default apiModule;
