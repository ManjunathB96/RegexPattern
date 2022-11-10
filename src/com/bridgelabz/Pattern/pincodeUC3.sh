#!/bin/bash -x 

#pic code uC3: check for 400088B this sholud fail
shopt -s extglob

pin="400088B"
pinPat="^[0-9]{6}*$"
read pinPat
if [[ $pin =~ $pinPat ]];
then
echo yes;
else
echo no;
fi
