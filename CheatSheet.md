# My Java & Git Cheat Sheet

## Git Setup (One Time)
- Generate SSH Key: `ssh-keygen -t ed25519 -C "email@example.com"`
- Test Connection: `ssh -T git@github.com`
- Set Remote URL: `git remote set-url origin git@github.com:User/Repo.git`

## Daily Workflow
1. Check status: `git status`
2. Stage all changes: `git add .`
3. Commit (Save): `git commit -m "Message here"`
4. Push (Upload): `git push`

## Troubleshooting
- Check remotes: `git remote -v`
- If push fails (no upstream): `git push -u origin main`