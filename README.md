scala-test-project
==================

Hello World Test

Creating and running Scala Hello World project.
- Project created using mvn archetype:generate.
- Tested running main() using mvn scala:console
-- scala> import org.perdue.App
-- scala> App.main(null)
-- Hello World!

Learning how to initialize a git repo and push changes.
- Created repo on github.
- Initialized local repo.
-- > git init
-- > git add .
-- > git commit
- Pulled project from github.
-- > git pull git@github.com:perdue/scala-test-project
- Added remote repo to project.
-- > git remote add origin git@github.com:perdue/scala-test-project.git
- Pushed all files to repo on github.
-- > git push origin master

Updated this readme and pushed changes.
-- > git add README.md
-- > git commit
-- > git push origin master
