pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/JordanAclarke/Theme-parkrides-jenkinsintegration.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}