package com.servicemaster.devops


/**
 * Pipeline Groovy class.
 */
class Pipeline implements Serializable {

  def env = System.getenv()
  def script

  Pipeline(def script){
    this.script = script
  }

  // Environment Variables from PAC.json
  def SolutionPath = 'SVM.Shared.API.Authorizations.sln'

  def outputEnvironmentVariables(){
    env.each{it ->
      script.echo  it
    }
  }

  def output(textToOutput){
    script.echo 'THIS IS THE START OF SOMETHING NEW'
    script.echo ${textToOutput}
    script.echo "THIS IS ME HOPING THIS SHIT WORKS ......"
  }

  def build() {
    def batCommand = "bat ${env.SLAVE_NUGET} restore ${SolutionPath}"
    println batCommand
    "${batCommand}".execute()
  }
}
