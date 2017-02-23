package com.servicemaster.devops


/**
 * Pipeline Groovy class.
 */
class Pipeline implements Serializable {

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
