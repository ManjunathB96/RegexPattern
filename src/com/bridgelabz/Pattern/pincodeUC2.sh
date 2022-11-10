#!/bin/bash -x

#Pin Code UC2:check for A400088 should fail
# because the  character A should follow to more consecutive charecters that is ABB then it is valid

shopt -s extglob

pin="A400088"
pinPat="^[0-9] {6}$"
read pinPat

if [[ $pin =~ $pinPat ]];
then
echo yes;
else
echo no;
fi
