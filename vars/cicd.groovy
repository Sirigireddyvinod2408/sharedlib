def gitDownload(repo)
{
    git "https://github.com/Sirigireddyvinod2408/${repo}.git"
}
def mavenBuild()
{
    sh 'mvn package'
}
