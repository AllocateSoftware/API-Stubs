# ASW.APIServices.Core - ASP.NET Core 2.0 Server

     ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```
## Run in Docker

```
cd src/ASW.APIServices.Core
docker build -t asw.apiservices.core .
docker run -p 5000:8080 asw.apiservices.core
```
