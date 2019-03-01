mvn clean compile assembly:single

## to deploy to osssonatype
mvn source:jar-no-fork javadoc:jar package gpg:sign deploy
