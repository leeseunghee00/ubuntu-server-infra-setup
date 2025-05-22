# ubuntu-server-infra-setup

> 데비안 계열 Ubuntu 서버를 기반으로 실무 환경을 고려한 인프라 구축 매뉴얼을 작성합니다. <br />
> 개발/운영 팀에 합류할 때 빠르게 서버를 세팅하고, 운영 환경을 구성할 수 있도록 단계별로 정리했습니다.

<br />

## Contents.

1. [Ubuntu 초기 세팅](https://leeseunghee00.notion.site/0-Ubuntu-1f2889b5fe3d8049b782fe96cbb2616c?pvs=4)
    - Common Configuration (Timezone, Locale, Swap Memory, Docker)
    - API Server Configuration (Java)
    - Web Server Configuration (Nginx)
3. [Database 구성](https://leeseunghee00.notion.site/1-Database-1f2889b5fe3d807c9ac2c7015d3cd7ab?pvs=4)
    - MySQL 환경 구성 (Docker Compose)
    - MySQL Backup
4. [API Server 구성](https://leeseunghee00.notion.site/2-API-Server-1f2889b5fe3d80a685f9deaee8bf8501?pvs=4)
    - Common Log Policy
    - API Server Setting
    - Shell Script 작성 (service_check, service_run, system_check)

<br />

## Directory Structure.

```bash
/wisoft
├── backend
│   ├── dev       # Dev API Server
│   ├── stage     # Stage API Server
│   └── prod      # Production API Server
├── database
│   └── mysql     # MySQL 8.0 관련 (여러 DB 사용을 고려하여 디렉토리 분리)
│       ├── dev       # Dev DB
│       └── prod
├── frontend      # Web Server (Dev, Stage, Prod)
├── jenkins       # Jenkins 
├── logs          # Log (API, Web, ETC)
│   ├── backend
│   │   ├── dev
│   │   ├── stage
│   │   └── prod
│   ├── crontab
│   └── frontend
└── shell         # Shell Script Directory
    ├── service_check.sh
    ├── service_run.sh
    └── system_run.sh
```
