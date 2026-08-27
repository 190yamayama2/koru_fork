package com.futuremind.koru.processor

import com.squareup.kotlinpoet.TypeName

fun wrongScopeProviderSupertype(): Nothing =
    throw IllegalStateException("ExportedScopeProvider can only be applied to a class extending ScopeProvider interface")

fun requiredExportOfScopeProvider(scopeProvider: TypeName): Nothing =
    throw IllegalStateException("$scopeProvider can only be used in @ToNativeClass(launchOnScope) if it has been annotated with @ExportedScopeProvider")

fun missingAnnotation(annotationQualifiedName: String, targetName: String): Nothing =
    throw IllegalStateException("Missing @$annotationQualifiedName annotation on $targetName")

fun missingAnnotationArgument(
    annotationQualifiedName: String,
    argumentName: String,
    targetName: String
): Nothing = throw IllegalStateException(
    "Missing '$argumentName' argument in @$annotationQualifiedName on $targetName"
)
