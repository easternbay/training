# Git basic develop flow
A basic toturial that'll you the basic usage of git command via terminal.

## Clone a remote repository
The `git clone` is used to clone a remote git repository from github or other kind of git servers. E.g. the following command will clone the tranining repo into current directory.

    git clone https://github.com/easternbay/training.git
    
## Add a new branch

You can use `git checkout -b <branch>` to checkout out to a new local branch when adding a new feature or fixings bugs. Be sure that you're aware that which branch you're currently on before running this command since the new branch will use the branch you're currently on as a base.

Follow a conversion that in the following format <your-name>/\<date\>-<branch_name> to checkout a branch. E.g.
    
    git checkout -b derek/20171221-add_training_docs

## Commit your code

After you add or modify a file, you need to commit it into git, so the changes could be shared with the other members of the project.


Run `git status` to view what files you need to commit. 

**Note** Don't commit your own test files. E.g.

    git status
 
Run `git diff <path>` to confirm the changes that you want to commit.
    
    git diff git.md
 
Then run `git add <path>` to change the file you modified into staged status for the next commit. **Note** Don't use `.` as path unless you're sure what's going to be add. E.g. 
    
    git add git.md
    
After you run  `git commit -m <msg>`, the staged will actually be commited into the local branch. **Note** Don't use `git commit . -m <msg>` unless you know what you're doing. 

## Push code to remote branch

After you finish the developing on your branch, you need to push your code to github or other remote repo. E.g.
    
    git push origin derek/20171221-add_training_docs

## Create a pull request in github
Navigate to https://www.github.com/ to find the project you're working on, and create a `pull request` that will merge your branch into master.

## Code Review
After you code is being reviewed, the reviewer should merge your branch. **Note** Don't merge your code by yourself.
    