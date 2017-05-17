#!/bin/bash
# el 2017/05
cp -r /home/xoldfusion/Descargas/openxava-5.7_aloe/workspace/aloe2017  aloev1
cp "/home/xoldfusion/Descargas/openxava-5.7_aloe/workspace/Servers/Tomcat v7.0 Server at localhost-config/server.xml"  /home/xoldfusion/Descargas/openxava-5.7_aloe/tomcat/conf/
cp "/home/xoldfusion/Descargas/openxava-5.7_aloe/workspace/Servers/Tomcat v7.0 Server at localhost-config/context.xml" /home/xoldfusion/Descargas/openxava-5.7_aloe/tomcat/conf/
cp "/home/xoldfusion/Descargas/openxava-5.7_aloe/workspace/Servers/Tomcat v7.0 Server at localhost-config/web.xml" /home/xoldfusion/Descargas/openxava-5.7_aloe/tomcat/conf/
cp /home/xoldfusion/Descargas/openxava-5.7_aloe/tomcat/conf/server.xml /home/xoldfusion/Descargas/aloe2017/tomcatfeliz
cp /home/xoldfusion/Descargas/openxava-5.7_aloe/tomcat/conf/context.xml /home/xoldfusion/Descargas/aloe2017/tomcatfeliz
cp /home/xoldfusion/Descargas/openxava-5.7_aloe/tomcat/conf/web.xml /home/xoldfusion/Descargas/aloe2017/tomcatfeliz
cp tomcatfeliz/server.xml  aloev1/tomcatfeliz/
cp tomcatfeliz/context.xml  aloev1/tomcatfeliz/
cp tomcatfeliz/web.xml  aloev1/tomcatfeliz/
cp *.sh aloev1/gitfeliz
rm *.*~
rm aloev1/*.*~
cd aloev1
git add -A
git commit -a -m "inicio aloe2017"
git push -u origin master
