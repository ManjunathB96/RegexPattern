#!/bin/bash -x

#pic code uC4: check for 400 088 this sholud fail
shopt -s extglob

pin="[400: :088]"
pinPat="^[0-9]{6}*$"
read pinPat
if [[ $pin =~ $pinPat ]];
then
echo yes;
else
echo no;
fi

