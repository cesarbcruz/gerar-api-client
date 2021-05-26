# logic-smartmind

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>logic.smartmind</groupId>
    <artifactId>logic-smartmind</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "logic.smartmind:logic-smartmind:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/logic-smartmind-0.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import logic.smartmind.client.invoker.*;
import logic.smartmind.client.invoker.auth.*;
import logic.smartmind.client.model.*;
import logic.smartmind.client.api.AssetenvironmentApi;

import java.io.File;
import java.util.*;

public class AssetenvironmentApiExample {

    public static void main(String[] args) {
        
        AssetenvironmentApi apiInstance = new AssetenvironmentApi();
        String assetid = "assetid_example"; // String | 
        try {
            apiInstance.assetenvironmentAssetidDelete(assetid);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetenvironmentApi#assetenvironmentAssetidDelete");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetenvironmentApi* | [**assetenvironmentAssetidDelete**](docs/AssetenvironmentApi.md#assetenvironmentAssetidDelete) | **DELETE** /assetenvironment/{assetid} | 
*AssetenvironmentApi* | [**assetenvironmentAssetidGet**](docs/AssetenvironmentApi.md#assetenvironmentAssetidGet) | **GET** /assetenvironment/{assetid} | 
*AssetenvironmentApi* | [**assetenvironmentAssetidPatch**](docs/AssetenvironmentApi.md#assetenvironmentAssetidPatch) | **PATCH** /assetenvironment/{assetid} | 
*AssetenvironmentApi* | [**assetenvironmentGet**](docs/AssetenvironmentApi.md#assetenvironmentGet) | **GET** /assetenvironment | 
*AssetenvironmentApi* | [**assetenvironmentPost**](docs/AssetenvironmentApi.md#assetenvironmentPost) | **POST** /assetenvironment | 
*AssetsApi* | [**assetsAssetidDelete**](docs/AssetsApi.md#assetsAssetidDelete) | **DELETE** /assets/{assetid} | 
*AssetsApi* | [**assetsAssetidGet**](docs/AssetsApi.md#assetsAssetidGet) | **GET** /assets/{assetid} | 
*AssetsApi* | [**assetsAssetidPatch**](docs/AssetsApi.md#assetsAssetidPatch) | **PATCH** /assets/{assetid} | 
*AssetsApi* | [**assetsGet**](docs/AssetsApi.md#assetsGet) | **GET** /assets | 
*AssetsApi* | [**assetsPost**](docs/AssetsApi.md#assetsPost) | **POST** /assets | 
*NotificationApi* | [**notificationPost**](docs/NotificationApi.md#notificationPost) | **POST** /notification | 
*OsApi* | [**osPost**](docs/OsApi.md#osPost) | **POST** /os | 
*ParamvariavelnotificacaoApi* | [**paramvariavelnotificacaoCodigoDelete**](docs/ParamvariavelnotificacaoApi.md#paramvariavelnotificacaoCodigoDelete) | **DELETE** /paramvariavelnotificacao/{codigo} | 
*ParamvariavelnotificacaoApi* | [**paramvariavelnotificacaoCodigoGet**](docs/ParamvariavelnotificacaoApi.md#paramvariavelnotificacaoCodigoGet) | **GET** /paramvariavelnotificacao/{codigo} | 
*ParamvariavelnotificacaoApi* | [**paramvariavelnotificacaoCodigoPatch**](docs/ParamvariavelnotificacaoApi.md#paramvariavelnotificacaoCodigoPatch) | **PATCH** /paramvariavelnotificacao/{codigo} | 
*ParamvariavelnotificacaoApi* | [**paramvariavelnotificacaoGet**](docs/ParamvariavelnotificacaoApi.md#paramvariavelnotificacaoGet) | **GET** /paramvariavelnotificacao | 
*ParamvariavelnotificacaoApi* | [**paramvariavelnotificacaoPost**](docs/ParamvariavelnotificacaoApi.md#paramvariavelnotificacaoPost) | **POST** /paramvariavelnotificacao | 
*SetorApi* | [**setorCodigoDelete**](docs/SetorApi.md#setorCodigoDelete) | **DELETE** /setor/{codigo} | 
*SetorApi* | [**setorCodigoGet**](docs/SetorApi.md#setorCodigoGet) | **GET** /setor/{codigo} | 
*SetorApi* | [**setorCodigoPatch**](docs/SetorApi.md#setorCodigoPatch) | **PATCH** /setor/{codigo} | 
*SetorApi* | [**setorGet**](docs/SetorApi.md#setorGet) | **GET** /setor | 
*SetorApi* | [**setorPost**](docs/SetorApi.md#setorPost) | **POST** /setor | 
*UsuarioApi* | [**usuarioGet**](docs/UsuarioApi.md#usuarioGet) | **GET** /usuario | 
*UsuarioApi* | [**usuarioLoginDelete**](docs/UsuarioApi.md#usuarioLoginDelete) | **DELETE** /usuario/{login} | 
*UsuarioApi* | [**usuarioLoginGet**](docs/UsuarioApi.md#usuarioLoginGet) | **GET** /usuario/{login} | 
*UsuarioApi* | [**usuarioLoginPatch**](docs/UsuarioApi.md#usuarioLoginPatch) | **PATCH** /usuario/{login} | 
*UsuarioApi* | [**usuarioPost**](docs/UsuarioApi.md#usuarioPost) | **POST** /usuario | 
*UsuariosetorApi* | [**usuariosetorLoginCodigoSetorPost**](docs/UsuariosetorApi.md#usuariosetorLoginCodigoSetorPost) | **POST** /usuariosetor/{login}/{codigoSetor} | 
*UsuariosetorApi* | [**usuariosetorLoginCodigosetorDelete**](docs/UsuariosetorApi.md#usuariosetorLoginCodigosetorDelete) | **DELETE** /usuariosetor/{login}/{codigosetor} | 


## Documentation for Models

 - [AssetEnvironment](docs/AssetEnvironment.md)
 - [AssetNotificationLog](docs/AssetNotificationLog.md)
 - [Assets](docs/Assets.md)
 - [ParamVariavelNotificacao](docs/ParamVariavelNotificacao.md)
 - [ParamVariavelNotificacao2](docs/ParamVariavelNotificacao2.md)
 - [Setor](docs/Setor.md)
 - [Usuario](docs/Usuario.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



