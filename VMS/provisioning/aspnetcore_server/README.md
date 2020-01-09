# ASW.APIServices.VMS - ASP.NET Core 2.0 Server

## Description  API to be impemented by 247Time (and, potentially, partners) to enable provisioning of accounts and the org structure 

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
