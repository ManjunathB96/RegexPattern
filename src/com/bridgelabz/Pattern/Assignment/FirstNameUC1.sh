#!/bin/bash -x

#UC1 :vaild first name
shopt -s extglob

echo "Enter your first name"
read firstname
regex="^[A-Z][a-zA-Z]{3,}$"
if [[ $firstname =~ $regex ]];
then
	echo valid;
else
	echo not valid;
fi
