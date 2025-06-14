# TERMINAL COMMANDS :

1. ### GIT CONFIGURATION
###### To connect to particular github account
~~~
git config --global user.name "<user_name>"
git config --global user.email "<user_email>"
~~~

2. ### NAVIGATION
###### Navigate to the desired folder
~~~
cd <location_name>
~~~

3. ### STATUS CHECK
###### To check if is it up to date
~~~
git status
~~~

4. ### BRANCH CREATION
- METHOD I :
    - STEPS :
        1. Create the new branch
        2. Navigate to the new branch
~~~
git branch <branch_name> 
git checkout <branch_name>
~~~
- METHOD II :
    - STEPS :
        1. Create the new branch and navigate.
~~~
git checkout -b <user_name>
~~~

5. ### CHANGES
###### To ask git to include the changes
~~~
git add
git add <location_of_file>
~~~

6. ### Commit
###### To save the changes made
~~~
git commit -m "<message>"
~~~

7. ### PUSH
###### To push the changes to the master branch
~~~
git push --set-upstream origin <branch_name>
~~~

8. ### PULL
###### To create and pull the request made by push
###### Open GitHub - Pull Requests - new Request - create and pull