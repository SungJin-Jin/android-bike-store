object Libs {

    object Kotlin {
        const val version = "1.5.31"

        const val serializable = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.0"
        const val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
    }

    object Google {
        const val material = "com.google.android.material:material:1.4.0"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.7.0"
        const val appcompat = "androidx.appcompat:appcompat:1.3.0"
        const val fragment = "androidx.fragment:fragment:1.3.2"

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        }

        object Compose {
            const val version = "1.1.0-beta02"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$version"
            const val material = "androidx.compose.material:material:$version"
        }

        object Lifecycle {
            private const val version = "2.4.0"
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$version"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        }

        object Navigation {
            private const val version = "2.3.4"

            const val compose = "androidx.navigation:navigation-compose:2.4.0-beta02"
        }

        object Room {
            private const val version = "2.2.6"

            const val runtime = "androidx.room:room-runtime:$version"
            const val ktx = "androidx.room:room-ktx:$version"
            const val compiler = "androidx.room:room-compiler:$version"

        }

        object Hilt {
            private const val version = "1.0.0-alpha02"
            const val compose = "androidx.hilt:hilt-navigation-compose:$version"
        }
    }

    object Dagger {
        const val version = "2.40"
        const val dagger = "com.google.dagger:dagger:$version"

        object Hilt {
            const val android = "com.google.dagger:hilt-android:$version"
            const val compiler = "com.google.dagger:hilt-compiler:$version"
        }
    }

    object Maps {
        const val maps = "com.google.android.libraries.maps:maps:3.1.0-beta"
        const val ktx = "com.google.maps.android:maps-v3-ktx:2.2.0"
    }

}