# MCP Server for FHIR/CQL

An example MCP server that uses a FHIR/CQL clinical decision support API to answer questions about the WADA classification of medicinal products.

## CDS API

See the clinical decision support API in [adamzkover/wada-list-fhir](https://github.com/adamzkover/wada-list-fhir).

## Inspector

To inspect the MCP server outside a client, use `npx @modelcontextprotocol/inspector`.

## AI Clients

The server can be used with AI applications that support the MCP tools feature. See [modelcontextprotocol.io/clients](https://modelcontextprotocol.io/clients). The service is tested with Claude Desktop.

## MCP Gateway

Claude Desktop supports local, command MCP servers only.
This service uses HTTP.

A gateway is a command that can bridge this gap and connect Claude Desktop to an MCP server over HTTP.

Install for example [@mcphub/gateway](https://www.npmjs.com/package/@mcphub/gateway).

## Using the MCP server

Use a prompt like "I am a professional athlete and want to take some Aspirin. Will this be a problem at a doping control?"

Claude Desktop should ask for permission to use the tool and, if granted, report the result from the tool.
