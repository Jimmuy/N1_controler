package com.jimmy.n1.controler

import com.jimmy.app.CoreApplication
import com.jimmy.iot.net.HttpClient

class BaseApplicaiton : CoreApplication() {
    override fun init() {
        HttpClient.init(this)
    }

}