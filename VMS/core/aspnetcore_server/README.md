# ASW.APIServices.VMS - ASP.NET Core 2.0 Server

## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 

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
cd src/ASW.APIServices.VMS
docker build -t asw.apiservices.vms .
docker run -p 5000:8080 asw.apiservices.vms
```
