node {
    stage('Validate')
    { bat 'mvn validate' }

    stage('Initialize') 
    { bat 'mvn initialize' }

    stage('Compile')
    { bat 'mvn compile' }
    
    stage('Test Compile')
    { bat 'mvn test-compile' }
    
    stage('Test')
    { bat 'mvn test' }
    
    stage('Integration Test')
    { bat 'mvn integration-test' }
    
    stage('Package')
    { bat 'mvn package' }
    
    stage('Verify')
    { bat 'mvn verify' }
    
    stage('Install')
    { bat 'mvn install' }
    
    stage('Deploy')
    { bat 'mvn deploy' }
}