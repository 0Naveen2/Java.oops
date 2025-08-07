@echo off
cd /d "%~dp0"
git add .
git commit -m "Auto update"
git push
echo Code pushed to GitHub!
pause
