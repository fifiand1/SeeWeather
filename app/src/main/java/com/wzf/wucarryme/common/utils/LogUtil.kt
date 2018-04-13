package com.wzf.wucarryme.common.utils

import android.util.Log
import com.wzf.wucarryme.BuildConfig

/**
 * @author wzf
 * @date 2018/3/22
 */

object LogUtil {
    fun v(tag: String, msg: String) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, msg)
        }
    }

    fun d(tag: String, msg: String) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, msg)
        }
    }

    fun i(tag: String, msg: String) {
        if (BuildConfig.DEBUG) {
            Log.i(tag, msg)
        }
    }

    fun w(tag: String, msg: String) {
        if (BuildConfig.DEBUG) {
            Log.w(tag, msg)
        }
    }

    fun e(tag: String, msg: String) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, msg)
        }
    }

    fun wtf(tag: String, msg: String) {
        if (BuildConfig.DEBUG) {
            Log.wtf(tag, msg)
        }
    }
}
