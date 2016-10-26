package com.beacon

/**
 * Created by huangpeng on 10/26/16.
 */
interface Search {
    fun suggestions(keyword: String, callback: (List<String>) -> Unit) : Unit
    fun searchResultUrl(keyword: String) : String
}