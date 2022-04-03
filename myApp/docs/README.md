# Code4Dem!


DEPLOY AN APP IN HEROKU
-----------------------
    Our source control is Github,
    Deploy in Heroku for free.

    NEDS : 
    ------
        Github Account and a Heroku Account
    
    Steps for deployment :
    --------------------
        1 : Open Github 
        2 : Create a new repository 
        3 : In spring tool Suite, Right-Click on your project and choose "Show in local Terrmional" > "Git Bash" or simply go to "Terminal"
            if you don't have git bash you will need to download it. (connect to github : git init, ...)
        4 : Add your project to the local git repository with following comments :
                 -> "git add ."
                 -> "git commit -am "description message of what you added" "
        5 : Go to git and copy the link repository (remode repository)
        6 : Add the remode repository to url, this will add your file to the repository 
            use the following comments :
                -> "git remote add origin <remote-repository-url>"
                -> "git remote -v"
                -> #verifies the remote repository URL
            NOTE : "origin" is the name use from git, you're free to use another name
        7 : Push all to the git repository
            Use the following comments 
                -> "git push origin master" or "git push"
                #this pushes all changed files in your local repository in git and you can go there and verify
                
        8 : Go to HEROKU    
            login : go to "Create an App" or "New"
                  : Give "App name, choose a region" NB : all the name is in lowercase
                  : "Create app"
                  : Deployment Method :
                  :                   : select "Github"
                  :                   : Search for repository to connect to : Enter "name-of-repository" select search
                  :                   : if it is your first time you will have to connect Heroku to yoy github account
                  :                   : When the search finished it will show you "connect" so just click on connect {in case it didn't found it go to git and make sure what you entered was correct}
                  :                   : Click on "Deploy Branch"
                    in case there is an error in heroku go to pom.xml change java version to 8


JAVA :
------
    NEXT THING IS ...