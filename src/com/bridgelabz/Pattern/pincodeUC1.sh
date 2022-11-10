#!/bin/bash -x

#Take -6 Digit Pin Code
pin="400088"
pinPat="^[0-9] {6}$"
read pinPat

if [[ $pin =~ $pinPat ]];
then
echo yes;
else
echo no;
fi




