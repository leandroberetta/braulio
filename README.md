# braulio

Let Braulio organize your Downloads folder. Braulio cleans your downloaded mess.

## Description

Braulio is developed in Java (base on Camel) and run in Wildly Swarm inside a Docker container.

Organizes typically a Downloads folder based on the file extensions generating a folder per extension.

The extensions are configured via the **extensionsRegex** in **braulio.properties**.

This file is added in the image creation process but it could be changed by mounting another file when the container is run.

The default value is:

    extensionsRegex=.*pdf|.*bin|.*srt|.*mp3|.*zip|.*rar

## Usage

First the image needs to be built:

    docker build -t=braulio .

Then the container can be started with the following command:

    docker run -d -v path/to/downloads/folder:/opt/braulio/downloads -v path/to/braulio/properties:/opt/braulio/braulio.properties --name braulio braulio