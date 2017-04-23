project {
	modelVersion '4.0.0'    
	groupId 'org.jfxtras'
	artifactId 'jfxtras-github-pages'
	version '1.0-SNAPSHOT'
	name 'JFXtras GitBug pages website'
	  
	build {
		plugins {
			plugin {
				// https://github.com/asciidoctor/asciidoctor-maven-plugin
				// http://asciidoctor.org/docs/asciidoc-syntax-quick-reference/
				groupId 'org.asciidoctor'
				artifactId 'asciidoctor-maven-plugin'
				version '1.5.5'
				executions {
					execution {
						id 'output-html'
						phase 'generate-sources'
						goals {
							goal 'process-asciidoc'
						}
						configuration {
							sourceDirectory '${basedir}/_asciidoc'
							outputDirectory '${basedir}'
							backend 'html'
						}
					}
				}
			}	
		}	
	}
}