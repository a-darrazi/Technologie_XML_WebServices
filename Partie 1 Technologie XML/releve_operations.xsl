<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:template match="/releve">
        <html>
            <head>
                <title></title>
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.2.3/css/bootstrap.min.css"/>
            </head>
            <body class="container">
                <h1 class="text-center my-3">Relevé</h1>
                <table class="table table-bordered mb-3">
                    <tbody>
                        <tr>
                            <th>date relevé:</th>
                            <td><xsl:value-of select="dateReleve"></xsl:value-of></td>
                        </tr>
                        <tr>
                            <th>RIB:</th>
                            <td><xsl:value-of select="@RIB"></xsl:value-of></td>
                        </tr>
                        <tr>
                            <th>Solde:</th>
                            <td><xsl:value-of select="solde"></xsl:value-of></td>
                        </tr>
                    </tbody>
                </table>
                <h3>Operations Between: 
                    <ins class="text-info"><xsl:value-of select="operations/@dateDebut"></xsl:value-of></ins>
                    and
                    <ins class="text-info"><xsl:value-of select="operations/@dateFin"></xsl:value-of></ins>
                </h3>
                <table class="table table-bordered table-striped">
                    <thead>
                        <tr>
                            <th>operation type</th> <th>operation date</th> <th>montant</th> <th>description</th>
                        </tr>
                    </thead>
                    <xsl:for-each select="operations/operation">
                        <tr>
                            <td><xsl:value-of select="@type"></xsl:value-of></td>
                            <td><xsl:value-of select="@date"></xsl:value-of></td>
                            <td><xsl:value-of select="@montant"></xsl:value-of></td>
                            <td><xsl:value-of select="@montant"></xsl:value-of></td>
                        </tr>
                    </xsl:for-each>
                    <tr>
                        <th colspan="3">Total Credit</th>
                        <td><xsl:value-of select="sum(operations/operation[@type='CREDIT']/@montant)"></xsl:value-of></td>
                    </tr>
                    <tr>
                        <th colspan="3">Total Debit</th>
                        <td><xsl:value-of select="sum(operations/operation[@type='DEBIT']/@montant)"></xsl:value-of></td>
                    </tr>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>