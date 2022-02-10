

package dependencies

object Versions {
    const val compileSdk = 31
    const val minSdk = 28
    const val targetSdk = 31

    private const val versionMajor = 0
    private const val versionMinor = 1
    private const val versionPatch = 0
    const val versionCode = versionMajor * 10000 + versionMinor * 100 + versionPatch

    const val versionName = "$versionMajor.$versionMinor.$versionPatch"
}
