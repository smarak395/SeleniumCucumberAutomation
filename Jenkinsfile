pipeline

{

agent any

stages
{

   stage('Compile stage')
     {

        steps  {
                withMaven(maven: 'maven_3_6_1')
                    {
                        sh 'mvn clean install'
                    }
               }
     }



   stage('Test stage')
     {

        steps  {
                withMaven(maven: 'maven_3_6_1')
                    {
                        sh 'mvn test -DskipTests=false'
                    }
               }
     }



   stage('Cucumber Reports')
     {

        steps  {
                cucumber buildStatus: "UNSTABLE",
                fileIncludePattern: "**/cucumber.json",
                jsonReportDirectory:'target'
               }
     }

}

}