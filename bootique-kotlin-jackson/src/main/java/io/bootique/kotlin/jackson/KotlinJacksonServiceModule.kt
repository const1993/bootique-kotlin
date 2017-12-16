package io.bootique.kotlin.jackson

import io.bootique.jackson.JacksonService
import io.bootique.kotlin.guice.KotlinBinder
import io.bootique.kotlin.guice.KotlinModule

/**
 * Bind [JacksonService] with [KotlinJacksonService].
 *
 * @author Ibragimov Ruslan
 * @since 0.25
 */
class KotlinJacksonServiceModule : KotlinModule {
    override fun configure(binder: KotlinBinder) {
        binder.bind(JacksonService::class).to(KotlinJacksonService::class).asSingleton()
    }
}
