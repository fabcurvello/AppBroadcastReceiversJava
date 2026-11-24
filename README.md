# App Broadcast Receivers (Java)

> Repositório didático: exercício prático de Android nativo com **Java**, desenvolvido e aplicado em sala de aula pelo Prof. Fabricio Curvello.

## Sobre o projeto

Aplicativo que detecta mudanças na **conexão de rede** usando um `BroadcastReceiver`.

## Contexto acadêmico

Exercício aplicado em sala de aula, usado como prática guiada com os alunos.

## Versão em Kotlin

Esta mesma aplicação também foi desenvolvida em **Kotlin**: [AppBroadcastReceiversKotlin](https://github.com/fabcurvello/AppBroadcastReceiversKotlin). Comparar as duas versões lado a lado ajuda a entender as diferenças de sintaxe entre Java e Kotlin no Android.

## O que o app faz

- A classe `NetworkChangeReceiver` recebe o evento de mudança de conectividade.
- Mostra um `Toast` informando se a rede está conectada ou desconectada.
- O receiver é registrado em `onResume()` e removido em `onPause()`.

## Conceitos trabalhados em aula

- `BroadcastReceiver` registrado dinamicamente
- `IntentFilter` e `ConnectivityManager`
- Permissão `ACCESS_NETWORK_STATE`
- Relação entre receivers e o ciclo de vida da Activity

## Tecnologias

- **Java**
- **Android SDK** (Android Studio)
- **Gradle**
- `minSdk 28` / `compileSdk 34`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppBroadcastReceiversJava.git
   ```
2. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou dispositivo físico com Android compatível com a API 28 ou superior.

## Veja também

Outros repositórios de aula com o mesmo tema:

- [AppDetectBatteryLowDBRJava](https://github.com/fabcurvello/AppDetectBatteryLowDBRJava)
- [AppDetectBatteryLowDBRKotlin](https://github.com/fabcurvello/AppDetectBatteryLowDBRKotlin)
- [AppDetectChargeDBRJava](https://github.com/fabcurvello/AppDetectChargeDBRJava)
- [AppDetectChargeDBRKotlin](https://github.com/fabcurvello/AppDetectChargeDBRKotlin)
- [AppNotifBateryLevelBRDJava](https://github.com/fabcurvello/AppNotifBateryLevelBRDJava)
- [AppNotifBateryLevelBRDKotlin](https://github.com/fabcurvello/AppNotifBateryLevelBRDKotlin)
- [AppNotifBootCompletedBREJAVA](https://github.com/fabcurvello/AppNotifBootCompletedBREJAVA)
- [AppNotifBootCompletedBREKotlin](https://github.com/fabcurvello/AppNotifBootCompletedBREKotlin)

## Autor

**Fabricio Curvello**: professor de desenvolvimento de software no SENAI-RJ (desde 1997) e em faculdades do grupo Ânima Educação (IBMR e UNA).

- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
