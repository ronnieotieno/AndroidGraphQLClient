/**
 *
 * Copyright 2020 David Odari
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *            http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 **/
package com.github.odaridavid.graphql

import android.os.Build
import androidx.test.ext.junit.runners.AndroidJUnit4
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

//TODO Figure out how to swap in localhost url with real url
@Config(sdk = [Build.VERSION_CODES.P])
@RunWith(AndroidJUnit4::class)
internal class MainViewModelTest {

    private lateinit var mockWebServer: MockWebServer

    @Before
    fun setup() {
        mockWebServer = MockWebServer().apply {
            start(8080)
            url("/")
        }

    }

    @Test
    fun shouldReturnSuccessStateResponse() {

    }

    @Test
    fun shouldReturnLoadingStateResponse() {

    }

    @Test
    fun shouldReturnErrorStateResponse() {

    }

    @After
    fun teardown() {
        mockWebServer.shutdown()
    }

}