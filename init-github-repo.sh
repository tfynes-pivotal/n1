git init -b main
git add . 
git commit -m "."
gh repo create n1 --public
git remote add origin https://github.com/tfynes-pivotal/n1
git branch -M main
git push -u origin main


