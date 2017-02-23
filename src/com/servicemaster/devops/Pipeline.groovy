package com.servicemaster.devops

import groovy.json.JsonSlurper

/**
 * Pipeline Groovy class.
 */
class Pipeline {

  def env = System.getenv()

  // Environment Variables from PAC.json
  def SolutionPath = 'SVM.Shared.API.Authorizations.sln'

  def outputEnvironmentVariables(){
    env.each{
      println it
    }
  }



  def build() {
    def batCommand = "bat ${env.SLAVE_NUGET} restore ${SolutionPath}"
    println batCommand
    "${batCommand}".execute()
  }
}
