pipeline {
    agent any
    environment {
        // Define any environment variables needed
    }
    stages {
        stage('Checkout') {
            steps {
                // Clona el repositorio
                git branch: 'main', url: 'https://frank-001-admin@bitbucket.org/frank-001/inventario-sistem.git', credentialsId: '6a09d31a-9a90-4085-ab6b-41657e750396'
            }
        }
        stage('Build') {
            steps {
                // Ejecuta el script Groovy para construir
                script {
                    def groovyScript = '''
                    // Tu código Groovy aquí
                    println "Construyendo el proyecto..."
                    '''
                    evaluate groovyScript
                }
            }
        }
        stage('Test') {
            steps {
                // Ejecuta pruebas
                script {
                    def groovyScript = '''
                    // Tu código Groovy para pruebas aquí
                    println "Ejecutando pruebas..."
                    '''
                    evaluate groovyScript
                }
            }
        }
    }
    post {
        always {
            // Opcional: Agregar notificaciones o limpieza
            echo 'Pipeline completo.'
        }
    }
}
