package co.zia.khalid.weatherapp.data.source.remote

interface RemoteToDataMapper<in Remote, out Data> {
    fun mapToData(remote: Remote): Data
}

interface DataToRemoteMapper<in Data, out Remote> {
    fun mapToRemote(data: Data): Remote
}
