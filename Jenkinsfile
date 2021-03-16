pipeline{
    
    agent any
    
    stages{
        
        stage("Build"){
            steps{
                echo("Building")
            }
        }
        
        stage("Deploy on Dev"){
            steps{
                echo("deploy on dev")
            }
        }
        
        stage("Deploy on Qa"){
            steps{
                echo("deploy on QA")
            }
        }
        
        stage("Regression Test"){
            steps{
                echo("running regression test")
            }
        }
        
        stage("Deploy on stage"){
            steps{
                echo("deploy on stage")
            }
        }
        
        stage("Sanity test on stage"){
            steps{
                echo("sanity test on stage")
            }
        }
        
        stage("Deploy on PROD"){
            steps{
                echo("deploy on PROD")
            }
        }
        
    }
    
}