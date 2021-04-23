package com.example.kakao_login_api_tutorial

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class TestApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "myToken")
    }
} //Kakao SDK를 사용하기 위한 Native App Key로 초기화