package generators

import com.squareup.kotlinpoet.FileSpec

sealed interface BaseGenerator {
    fun generate(filePackage: String): FileSpec
}
