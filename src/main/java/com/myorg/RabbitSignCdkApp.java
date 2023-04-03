package com.myorg;

import software.amazon.awscdk.App;

public final class RabbitSignCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        new RabbitSignCdkStack(app, "RabbitSignCdkStack");

        app.synth();
    }
}
