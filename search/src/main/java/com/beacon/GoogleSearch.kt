package com.beacon

import com.github.kittinunf.fuel.*
import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.Response
import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.github.kittinunf.fuel.rx.rx_object

/**
 * Created by huangpeng on 10/26/16.
 */
class GoogleSearch : Search {
    override fun suggestions(keyword: String, callback: (List<String>) -> Unit) {
        Fuel.get("http://httpbin.org/get").responseString { request, response, result ->
            result.fold({ d ->
                print(d)
            }, { err ->
                //do something with error
            })
        }
    }

    override fun searchResultUrl(keyword: String) : String {
        val url = "https://www.google.com.hk/search?cad=h&q=" + keyword
        return url
    }
}