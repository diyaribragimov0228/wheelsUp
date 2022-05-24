mkdir "myfiles"
cd myfiles
touch myfile.txt myfile1.txt myfile2.txt myfile3.txt myfile4.txt myfile5.txt myfile6.txt myfile7.txt
ls -1tr | head -n -3 | xargs -d '\n' rm -f --
for file in *; do  (echo "I am $file"; cat -- "$file") > "$file.new";  mv -- "$file.new" "$file"; done
