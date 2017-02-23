//
// Generated from archetype; please customize.
//

// package com.servicemaster.devops

import spock.lang.Specification

/**
 * Tests for the {@link Pipeline} class.
 */
class PipelineTest extends Specification {

  def "Output Environment variables"() {
    when:
    new Pipeline().outputEnvironmentVariables()

    then:
    assert (true)
  }

  def "Test that build is right"() {
    when:
    new Pipeline().build()

    then:
    assert (true)

  }
}
