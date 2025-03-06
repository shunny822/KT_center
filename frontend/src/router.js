
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import LossreportLossReportManager from "./components/listers/LossreportLossReportCards"
import LossreportLossReportDetail from "./components/listers/LossreportLossReportDetail"

import MylossinfoLossInfoManagementManager from "./components/listers/MylossinfoLossInfoManagementCards"
import MylossinfoLossInfoManagementDetail from "./components/listers/MylossinfoLossInfoManagementDetail"

import LossInformationView from "./components/LossInformationView"
import LossInformationViewDetail from "./components/LossInformationViewDetail"
import AdminServiceManagementManager from "./components/listers/AdminServiceManagementCards"
import AdminServiceManagementDetail from "./components/listers/AdminServiceManagementDetail"

import AlarmAlarmManagementManager from "./components/listers/AlarmAlarmManagementCards"
import AlarmAlarmManagementDetail from "./components/listers/AlarmAlarmManagementDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/lossreports/lossReports',
                name: 'LossreportLossReportManager',
                component: LossreportLossReportManager
            },
            {
                path: '/lossreports/lossReports/:id',
                name: 'LossreportLossReportDetail',
                component: LossreportLossReportDetail
            },

            {
                path: '/mylossinfos/lossInfoManagements',
                name: 'MylossinfoLossInfoManagementManager',
                component: MylossinfoLossInfoManagementManager
            },
            {
                path: '/mylossinfos/lossInfoManagements/:id',
                name: 'MylossinfoLossInfoManagementDetail',
                component: MylossinfoLossInfoManagementDetail
            },

            {
                path: '/mylossinfos/lossInformations',
                name: 'LossInformationView',
                component: LossInformationView
            },
            {
                path: '/mylossinfos/lossInformations/:id',
                name: 'LossInformationViewDetail',
                component: LossInformationViewDetail
            },
            {
                path: '/admins/serviceManagements',
                name: 'AdminServiceManagementManager',
                component: AdminServiceManagementManager
            },
            {
                path: '/admins/serviceManagements/:id',
                name: 'AdminServiceManagementDetail',
                component: AdminServiceManagementDetail
            },

            {
                path: '/alarms/alarmManagements',
                name: 'AlarmAlarmManagementManager',
                component: AlarmAlarmManagementManager
            },
            {
                path: '/alarms/alarmManagements/:id',
                name: 'AlarmAlarmManagementDetail',
                component: AlarmAlarmManagementDetail
            },



    ]
})
